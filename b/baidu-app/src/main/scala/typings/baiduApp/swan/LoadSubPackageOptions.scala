package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadSubPackageOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var root: String = js.native
}
object LoadSubPackageOptions {
  
  @scala.inline
  def apply(root: String): LoadSubPackageOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadSubPackageOptions]
  }
  
  @scala.inline
  implicit class LoadSubPackageOptionsMutableBuilder[Self <: LoadSubPackageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
