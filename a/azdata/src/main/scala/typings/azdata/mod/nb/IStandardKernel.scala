package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStandardKernel extends StObject {
  
  val connectionProviderIds: js.Array[String] = js.native
  
  val displayName: String = js.native
  
  val name: String = js.native
}
object IStandardKernel {
  
  @scala.inline
  def apply(connectionProviderIds: js.Array[String], displayName: String, name: String): IStandardKernel = {
    val __obj = js.Dynamic.literal(connectionProviderIds = connectionProviderIds.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandardKernel]
  }
  
  @scala.inline
  implicit class IStandardKernelMutableBuilder[Self <: IStandardKernel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionProviderIds(value: js.Array[String]): Self = StObject.set(x, "connectionProviderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionProviderIdsVarargs(value: String*): Self = StObject.set(x, "connectionProviderIds", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
