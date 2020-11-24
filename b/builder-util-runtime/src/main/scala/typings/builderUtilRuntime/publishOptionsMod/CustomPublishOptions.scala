package typings.builderUtilRuntime.publishOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPublishOptions
  extends PublishConfiguration
     with /* index */ StringDictionary[js.Any]
     with _AllPublishOptions
object CustomPublishOptions {
  
  @scala.inline
  def apply(provider: PublishProvider): CustomPublishOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPublishOptions]
  }
}
