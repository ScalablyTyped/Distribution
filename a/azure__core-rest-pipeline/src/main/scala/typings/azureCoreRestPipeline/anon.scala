package typings.azureCoreRestPipeline

import typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.PipelinePhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CustomNoProxyList extends StObject {
    
    /** a list of patterns to override those loaded from NO_PROXY environment variable. */
    var customNoProxyList: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CustomNoProxyList {
    
    inline def apply(): CustomNoProxyList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomNoProxyList]
    }
    
    extension [Self <: CustomNoProxyList](x: Self) {
      
      inline def setCustomNoProxyList(value: js.Array[String]): Self = StObject.set(x, "customNoProxyList", value.asInstanceOf[js.Any])
      
      inline def setCustomNoProxyListUndefined: Self = StObject.set(x, "customNoProxyList", js.undefined)
      
      inline def setCustomNoProxyListVarargs(value: String*): Self = StObject.set(x, "customNoProxyList", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var phase: js.UndefOr[PipelinePhase] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhase(value: PipelinePhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
      
      inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    }
  }
  
  trait Phase extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var phase: js.UndefOr[typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.PipelinePhase] = js.undefined
  }
  object Phase {
    
    inline def apply(): Phase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Phase]
    }
    
    extension [Self <: Phase](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhase(value: typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.PipelinePhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
      
      inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    }
  }
  
  trait PreserveCase extends StObject {
    
    var preserveCase: js.UndefOr[Boolean] = js.undefined
  }
  object PreserveCase {
    
    inline def apply(): PreserveCase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreserveCase]
    }
    
    extension [Self <: PreserveCase](x: Self) {
      
      inline def setPreserveCase(value: Boolean): Self = StObject.set(x, "preserveCase", value.asInstanceOf[js.Any])
      
      inline def setPreserveCaseUndefined: Self = StObject.set(x, "preserveCase", js.undefined)
    }
  }
}
