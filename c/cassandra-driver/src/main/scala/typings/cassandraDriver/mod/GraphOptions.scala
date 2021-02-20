package typings.cassandraDriver.mod

import typings.cassandraDriver.typesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphOptions extends StObject {
  
  var language: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var readConsistency: js.UndefOr[consistencies] = js.native
  
  var readTimeout: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var writeConsistency: js.UndefOr[consistencies] = js.native
}
object GraphOptions {
  
  @scala.inline
  def apply(): GraphOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphOptions]
  }
  
  @scala.inline
  implicit class GraphOptionsMutableBuilder[Self <: GraphOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReadConsistency(value: consistencies): Self = StObject.set(x, "readConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadConsistencyUndefined: Self = StObject.set(x, "readConsistency", js.undefined)
    
    @scala.inline
    def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeoutUndefined: Self = StObject.set(x, "readTimeout", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setWriteConsistency(value: consistencies): Self = StObject.set(x, "writeConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteConsistencyUndefined: Self = StObject.set(x, "writeConsistency", js.undefined)
  }
}
