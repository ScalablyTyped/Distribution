package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerEngineType extends StObject {
  
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.native
  
  /**
    * The list of engine versions.
    */
  var EngineVersions: js.UndefOr[listOfEngineVersion] = js.native
}
object BrokerEngineType {
  
  @scala.inline
  def apply(): BrokerEngineType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerEngineType]
  }
  
  @scala.inline
  implicit class BrokerEngineTypeMutableBuilder[Self <: BrokerEngineType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    @scala.inline
    def setEngineVersions(value: listOfEngineVersion): Self = StObject.set(x, "EngineVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionsUndefined: Self = StObject.set(x, "EngineVersions", js.undefined)
    
    @scala.inline
    def setEngineVersionsVarargs(value: EngineVersion*): Self = StObject.set(x, "EngineVersions", js.Array(value :_*))
  }
}
