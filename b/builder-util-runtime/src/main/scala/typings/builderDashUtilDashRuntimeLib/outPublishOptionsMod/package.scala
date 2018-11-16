package typings
package builderDashUtilDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outPublishOptionsMod {
  type AllPublishOptions = java.lang.String | GithubOptions | S3Options | SpacesOptions | GenericServerOptions | BintrayOptions | CustomPublishOptions
  type Publish = AllPublishOptions | js.Array[AllPublishOptions] | scala.Null
  type PublishProvider = builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.github | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.bintray | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.s3 | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.spaces | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.generic | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.custom
}
