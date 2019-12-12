package typings.chromeDashApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chromeDashApps.chromeDashAppsStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level object can't have additionalProperties.
  * The properties declared are the policies for this app.
  */
@js.native
trait ManagedSchema extends js.Object {
  /** Each schema must have either a $ref value or exactly one type. */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  /**
    * 'properties' maps an optional key of this object to its schema. At the
    * top-level object, these keys are the policy names supported.
    */
  var properties: js.UndefOr[
    StringDictionary[
      JSONSchemaBasicType | JSONSchemaArrayType | JSONSchemaObjectType | JSONSchemaRefType
    ]
  ] = js.native
  /** The top-level schema must have type object. */
  var `type`: `object` = js.native
}

