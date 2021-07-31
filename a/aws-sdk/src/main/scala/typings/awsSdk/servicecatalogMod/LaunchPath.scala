package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchPath extends StObject {
  
  /**
    * The identifier of the launch path.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.undefined
  
  /**
    * The name of the launch path.
    */
  var Name: js.UndefOr[PortfolioName] = js.undefined
}
object LaunchPath {
  
  @scala.inline
  def apply(): LaunchPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPath]
  }
  
  @scala.inline
  implicit class LaunchPathMutableBuilder[Self <: LaunchPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: PortfolioName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
