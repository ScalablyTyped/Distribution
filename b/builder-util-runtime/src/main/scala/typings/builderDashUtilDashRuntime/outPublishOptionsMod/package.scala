package typings.builderDashUtilDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outPublishOptionsMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.builderDashUtilDashRuntime.outPublishOptionsMod.GithubOptions
    - typings.builderDashUtilDashRuntime.outPublishOptionsMod.S3Options
    - typings.builderDashUtilDashRuntime.outPublishOptionsMod.SpacesOptions
    - typings.builderDashUtilDashRuntime.outPublishOptionsMod.GenericServerOptions
    - typings.builderDashUtilDashRuntime.outPublishOptionsMod.BintrayOptions
    - typings.builderDashUtilDashRuntime.outPublishOptionsMod.CustomPublishOptions
  */
  type AllPublishOptions = _AllPublishOptions | String
  type Publish = AllPublishOptions | js.Array[AllPublishOptions] | Null
}
