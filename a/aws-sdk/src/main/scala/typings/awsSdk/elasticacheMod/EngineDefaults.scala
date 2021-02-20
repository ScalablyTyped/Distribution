package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineDefaults extends StObject {
  
  /**
    * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
    */
  var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.native
  
  /**
    * Specifies the name of the cache parameter group family to which the engine default parameters apply. Valid values are: memcached1.4 | memcached1.5 | memcached1.6 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | redis6.x | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * Contains a list of engine default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
}
object EngineDefaults {
  
  @scala.inline
  def apply(): EngineDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineDefaults]
  }
  
  @scala.inline
  implicit class EngineDefaultsMutableBuilder[Self <: EngineDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheNodeTypeSpecificParameters(value: CacheNodeTypeSpecificParametersList): Self = StObject.set(x, "CacheNodeTypeSpecificParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeTypeSpecificParametersUndefined: Self = StObject.set(x, "CacheNodeTypeSpecificParameters", js.undefined)
    
    @scala.inline
    def setCacheNodeTypeSpecificParametersVarargs(value: CacheNodeTypeSpecificParameter*): Self = StObject.set(x, "CacheNodeTypeSpecificParameters", js.Array(value :_*))
    
    @scala.inline
    def setCacheParameterGroupFamily(value: String): Self = StObject.set(x, "CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupFamilyUndefined: Self = StObject.set(x, "CacheParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
