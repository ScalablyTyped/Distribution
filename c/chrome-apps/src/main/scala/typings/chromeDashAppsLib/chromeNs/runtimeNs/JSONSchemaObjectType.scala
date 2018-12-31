package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchemaObjectType extends js.Object {
  var additionalProperties: js.UndefOr[JSONSchemaObjectType] = js.undefined
  var properties: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[JSONSchemaBasicType | JSONSchemaRefType]
  ] = js.undefined
  /**
    * An 'object' can have known properties listed as 'properties', and can
    * optionally have 'additionalProperties' indicating a schema to apply to
    * keys that aren't found in 'properties'.
    */
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.`object`
}

