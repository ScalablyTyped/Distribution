package typings.cloudeventsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.cloudeventsSdk.cloudeventMod.CE
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v03Mod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.cloudeventsSdk.cloudeventMod.CE because Already inherited */ trait CloudEventV03
    extends StObject
       with CloudEventV03Attributes {
    
    /**
      * [REQUIRED] Identifies the event. Producers MUST ensure that `source` + `id`
      * is unique for each distinct event. If a duplicate event is re-sent (e.g. due
      * to a network error) it MAY have the same `id`. Consumers MAY assume that
      * Events with identical `source` and `id` are duplicates.
      * @required Non-empty string. Unique within producer.
      * @example An event counter maintained by the producer
      * @example A UUID
      */
    var id: String
    
    /**
      * [REQUIRED] The version of the CloudEvents specification which the event
      * uses. This enables the interpretation of the context. Compliant event
      * producers MUST use a value of `1.0` when referring to this version of the
      * specification.
      * @required MUST be a non-empty string.
      */
    var specversion: String
  }
  object CloudEventV03 {
    
    @scala.inline
    def apply(id: String, source: String, specversion: String, `type`: String): CloudEventV03 = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudEventV03]
    }
    
    @scala.inline
    implicit class CloudEventV03MutableBuilder[Self <: CloudEventV03] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecversion(value: String): Self = StObject.set(x, "specversion", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudEventV03Attributes
    extends StObject
       with /**
    * [OPTIONAL] CloudEvents extension attributes.
    */
  /* key */ StringDictionary[js.Any]
       with CE {
    
    /**
      * [OPTIONAL] The event payload. This specification does not place any restriction
      * on the type of this information. It is encoded into a media format which is
      * specified by the datacontenttype attribute (e.g. application/json), and adheres
      * to the dataschema format when those respective attributes are present.
      */
    var data: js.UndefOr[js.Any | String | Double | Boolean | Null] = js.undefined
    
    /**
      * The following fields are optional.
      */
    /**
      * [OPTIONAL] Describes the content encoding for the data attribute for when the
      * data field MUST be encoded as a string, like with structured transport binding
      * modes using the JSON event format, but the datacontenttype indicates a non-string
      * media type. When the data field's effective data type is not String, this attribute
      * MUST NOT be set and MUST be ignored when set.
      */
    var dataContentEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * [OPTIONAL] Content type of `data` value. This attribute enables `data` to
      * carry any type of content, whereby format and encoding might differ from that
      * of the chosen event format. For example, an event rendered using the
      * [JSON envelope](./json-format.md#3-envelope) format might carry an XML payload
      * in `data`, and the consumer is informed by this attribute being set to
      * "application/xml". The rules for how `data` content is rendered for different
      * `datacontenttype` values are defined in the event format specifications; for
      * example, the JSON event format defines the relationship in
      * [section 3.1](./json-format.md#31-handling-of-data).
      */
    var dataContentType: js.UndefOr[String] = js.undefined
    
    /**
      * [OPTIONAL] A link to the schema that the data attribute adheres to.
      * Incompatible changes to the schema SHOULD be reflected by a different URL.
      * If present, MUST be a non-empty URI.
      */
    var schemaURL: js.UndefOr[String] = js.undefined
    
    /**
      * [REQUIRED] Identifies the context in which an event happened. Often this
      * will include information such as the type of the event source, the
      * organization publishing the event or the process that produced the event. The
      * exact syntax and semantics behind the data encoded in the URI is defined by
      * the event producer.
      * Producers MUST ensure that `source` + `id` is unique for each distinct event.
      * An application MAY assign a unique `source` to each distinct producer, which
      * makes it easy to produce unique IDs since no other producer will have the same
      * source. The application MAY use UUIDs, URNs, DNS authorities or an
      * application-specific scheme to create unique `source` identifiers.
      * A source MAY include more than one producer. In that case the producers MUST
      * collaborate to ensure that `source` + `id` is unique for each distinct event.
      * @required Non-empty URI-reference
      */
    var source: String
    
    /**
      * [OPTIONAL] This describes the subject of the event in the context of the
      * event producer (identified by `source`). In publish-subscribe scenarios, a
      * subscriber will typically subscribe to events emitted by a `source`, but the
      * `source` identifier alone might not be sufficient as a qualifier for any
      * specific event if the `source` context has internal sub-structure.
      *
      * Identifying the subject of the event in context metadata (opposed to only in
      * the `data` payload) is particularly helpful in generic subscription filtering
      * scenarios where middleware is unable to interpret the `data` content. In the
      * above example, the subscriber might only be interested in blobs with names
      * ending with '.jpg' or '.jpeg' and the `subject` attribute allows for
      * constructing a simple and efficient string-suffix filter for that subset of
      * events.
      *
      * If present, MUST be a non-empty string.
      * @example "https://example.com/storage/tenant/container"
      * @example "mynewfile.jpg"
      */
    var subject: js.UndefOr[String] = js.undefined
    
    /**
      * [OPTIONAL] Timestamp of when the occurrence happened. If the time of the
      * occurrence cannot be determined then this attribute MAY be set to some other
      * time (such as the current time) by the CloudEvents producer, however all
      * producers for the same `source` MUST be consistent in this respect. In other
      * words, either they all use the actual time of the occurrence or they all use
      * the same algorithm to determine the value used.
      * @example "2020-08-08T14:48:09.769Z"
      */
    var time: js.UndefOr[Date | String] = js.undefined
    
    /**
      * [REQUIRED] This attribute contains a value describing the type of event
      * related to the originating occurrence. Often this attribute is used for
      * routing, observability, policy enforcement, etc. The format of this is
      * producer defined and might include information such as the version of the
      * `type` - see
      * [Versioning of Attributes in the Primer](primer.md#versioning-of-attributes)
      * for more information.
      * @required MUST be a non-empty string
      * @should SHOULD be prefixed with a reverse-DNS name. The prefixed domain dictates the
      *   organization which defines the semantics of this event type.
      * @example com.github.pull.create
      * @example com.example.object.delete.v2
      */
    var `type`: String
  }
  object CloudEventV03Attributes {
    
    @scala.inline
    def apply(source: String, `type`: String): CloudEventV03Attributes = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudEventV03Attributes]
    }
    
    @scala.inline
    implicit class CloudEventV03AttributesMutableBuilder[Self <: CloudEventV03Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any | String | Double | Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataContentEncoding(value: String): Self = StObject.set(x, "dataContentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataContentEncodingUndefined: Self = StObject.set(x, "dataContentEncoding", js.undefined)
      
      @scala.inline
      def setDataContentType(value: String): Self = StObject.set(x, "dataContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataContentTypeUndefined: Self = StObject.set(x, "dataContentType", js.undefined)
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setSchemaURL(value: String): Self = StObject.set(x, "schemaURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaURLUndefined: Self = StObject.set(x, "schemaURL", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setTime(value: Date | String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
