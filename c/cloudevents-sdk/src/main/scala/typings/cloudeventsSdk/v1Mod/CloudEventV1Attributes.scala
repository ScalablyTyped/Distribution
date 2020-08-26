package typings.cloudeventsSdk.v1Mod

import org.scalablytyped.runtime.StringDictionary
import typings.cloudeventsSdk.cloudeventMod.CE
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudEventV1Attributes
  extends /**
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
  var data: js.UndefOr[js.Any | String | Double | Boolean | Null] = js.native
  /**
    * The following fields are optional.
    */
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
  var dataContentType: js.UndefOr[String] = js.native
  /**
    * [OPTIONAL] Identifies the schema that `data` adheres to. Incompatible
    * changes to the schema SHOULD be reflected by a different URI. See
    * [Versioning of Attributes in the Primer](primer.md#versioning-of-attributes)
    * for more information.
    * If present, MUST be a non-empty URI.
    */
  var dataSchema: js.UndefOr[String] = js.native
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
  var source: String = js.native
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
  var subject: js.UndefOr[String] = js.native
  /**
    * [OPTIONAL] Timestamp of when the occurrence happened. If the time of the
    * occurrence cannot be determined then this attribute MAY be set to some other
    * time (such as the current time) by the CloudEvents producer, however all
    * producers for the same `source` MUST be consistent in this respect. In other
    * words, either they all use the actual time of the occurrence or they all use
    * the same algorithm to determine the value used.
    * @example "2020-08-08T14:48:09.769Z"
    */
  var time: js.UndefOr[Date | String] = js.native
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
  var `type`: String = js.native
}

object CloudEventV1Attributes {
  @scala.inline
  def apply(source: String, `type`: String): CloudEventV1Attributes = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudEventV1Attributes]
  }
  @scala.inline
  implicit class CloudEventV1AttributesOps[Self <: CloudEventV1Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any | String | Double | Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setDataContentType(value: String): Self = this.set("dataContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataContentType: Self = this.set("dataContentType", js.undefined)
    @scala.inline
    def setDataSchema(value: String): Self = this.set("dataSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSchema: Self = this.set("dataSchema", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTime(value: Date | String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

