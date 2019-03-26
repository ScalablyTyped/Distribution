package typings
package builderDashUtilDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outPublishOptionsMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - GithubOptions
    - S3Options
    - SpacesOptions
    - GenericServerOptions
    - BintrayOptions
    - CustomPublishOptions
  */
  type AllPublishOptions = _AllPublishOptions | java.lang.String
  type Publish = AllPublishOptions | js.Array[AllPublishOptions] | scala.Null
}
