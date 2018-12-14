package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * The top-level object can't have additionalProperties.
         * The properties declared are the policies for this app.
         */

trait ManagedSchema extends js.Object {
  /** Each schema must have either a $ref value or exactly one type. */
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  /**
               * 'properties' maps an optional key of this object to its schema. At the
               * top-level object, these keys are the policy names supported.
               */
  var properties: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      JSONSchemaBasicType | JSONSchemaArrayType | JSONSchemaObjectType | JSONSchemaRefType
    ]
  ] = js.undefined
  /** The top-level schema must have type object. */
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.`object`
}

