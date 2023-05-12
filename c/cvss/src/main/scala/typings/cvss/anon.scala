package typings.cvss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: Double
    
    var environmental: Double
    
    var temporal: Double
  }
  object Base {
    
    inline def apply(base: Double, environmental: Double, temporal: Double): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], environmental = environmental.asInstanceOf[js.Any], temporal = temporal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setEnvironmental(value: Double): Self = StObject.set(x, "environmental", value.asInstanceOf[js.Any])
      
      inline def setTemporal(value: Double): Self = StObject.set(x, "temporal", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<cvss.cvss.CVSSOptions, 'baseOnly'> */
  trait OmitCVSSOptionsbaseOnly extends StObject {
    
    var env: js.UndefOr[Boolean] = js.undefined
    
    var temporal: js.UndefOr[Boolean] = js.undefined
    
    var `throw`: js.UndefOr[Boolean] = js.undefined
  }
  object OmitCVSSOptionsbaseOnly {
    
    inline def apply(): OmitCVSSOptionsbaseOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitCVSSOptionsbaseOnly]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitCVSSOptionsbaseOnly] (val x: Self) extends AnyVal {
      
      inline def setEnv(value: Boolean): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setTemporal(value: Boolean): Self = StObject.set(x, "temporal", value.asInstanceOf[js.Any])
      
      inline def setTemporalUndefined: Self = StObject.set(x, "temporal", js.undefined)
      
      inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  /* Inlined std.Omit<cvss.cvss.CVSSOptions, 'env'> */
  trait OmitCVSSOptionsenv extends StObject {
    
    var baseOnly: js.UndefOr[Boolean] = js.undefined
    
    var temporal: js.UndefOr[Boolean] = js.undefined
    
    var `throw`: js.UndefOr[Boolean] = js.undefined
  }
  object OmitCVSSOptionsenv {
    
    inline def apply(): OmitCVSSOptionsenv = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitCVSSOptionsenv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitCVSSOptionsenv] (val x: Self) extends AnyVal {
      
      inline def setBaseOnly(value: Boolean): Self = StObject.set(x, "baseOnly", value.asInstanceOf[js.Any])
      
      inline def setBaseOnlyUndefined: Self = StObject.set(x, "baseOnly", js.undefined)
      
      inline def setTemporal(value: Boolean): Self = StObject.set(x, "temporal", value.asInstanceOf[js.Any])
      
      inline def setTemporalUndefined: Self = StObject.set(x, "temporal", js.undefined)
      
      inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  /* Inlined std.Omit<cvss.cvss.CVSSOptions, 'temporal'> */
  trait OmitCVSSOptionstemporal extends StObject {
    
    var baseOnly: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[Boolean] = js.undefined
    
    var `throw`: js.UndefOr[Boolean] = js.undefined
  }
  object OmitCVSSOptionstemporal {
    
    inline def apply(): OmitCVSSOptionstemporal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitCVSSOptionstemporal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitCVSSOptionstemporal] (val x: Self) extends AnyVal {
      
      inline def setBaseOnly(value: Boolean): Self = StObject.set(x, "baseOnly", value.asInstanceOf[js.Any])
      
      inline def setBaseOnlyUndefined: Self = StObject.set(x, "baseOnly", js.undefined)
      
      inline def setEnv(value: Boolean): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
}
