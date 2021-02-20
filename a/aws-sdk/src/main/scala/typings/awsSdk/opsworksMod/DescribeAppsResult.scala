package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAppsResult extends StObject {
  
  /**
    * An array of App objects that describe the specified apps. 
    */
  var Apps: js.UndefOr[typings.awsSdk.opsworksMod.Apps] = js.native
}
object DescribeAppsResult {
  
  @scala.inline
  def apply(): DescribeAppsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppsResult]
  }
  
  @scala.inline
  implicit class DescribeAppsResultMutableBuilder[Self <: DescribeAppsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApps(value: Apps): Self = StObject.set(x, "Apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsUndefined: Self = StObject.set(x, "Apps", js.undefined)
    
    @scala.inline
    def setAppsVarargs(value: App*): Self = StObject.set(x, "Apps", js.Array(value :_*))
  }
}
