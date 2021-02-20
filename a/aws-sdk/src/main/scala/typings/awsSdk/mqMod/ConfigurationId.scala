package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationId extends StObject {
  
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The revision number of the configuration.
    */
  var Revision: js.UndefOr[integer] = js.native
}
object ConfigurationId {
  
  @scala.inline
  def apply(): ConfigurationId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationId]
  }
  
  @scala.inline
  implicit class ConfigurationIdMutableBuilder[Self <: ConfigurationId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setRevision(value: integer): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
  }
}
