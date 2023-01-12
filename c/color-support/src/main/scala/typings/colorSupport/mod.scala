package typings.colorSupport

import org.scalablytyped.runtime.Shortcut
import typings.colorSupport.colorSupportBooleans.`false`
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("color-support", JSImport.Namespace)
  @js.native
  val ^ : ColorSupport = js.native
  
  type ColorSupport = js.Function2[
    /* options */ js.UndefOr[ColorSupportOptions], 
    /* obj */ js.UndefOr[ColorSupportResult], 
    `false` | ColorSupportResult
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.colorSupport.colorSupportInts.`0`
    - typings.colorSupport.colorSupportInts.`1`
    - typings.colorSupport.colorSupportInts.`2`
    - typings.colorSupport.colorSupportInts.`3`
  */
  trait ColorSupportLevel extends StObject
  object ColorSupportLevel {
    
    inline def `0`: typings.colorSupport.colorSupportInts.`0` = 0.asInstanceOf[typings.colorSupport.colorSupportInts.`0`]
    
    inline def `1`: typings.colorSupport.colorSupportInts.`1` = 1.asInstanceOf[typings.colorSupport.colorSupportInts.`1`]
    
    inline def `2`: typings.colorSupport.colorSupportInts.`2` = 2.asInstanceOf[typings.colorSupport.colorSupportInts.`2`]
    
    inline def `3`: typings.colorSupport.colorSupportInts.`3` = 3.asInstanceOf[typings.colorSupport.colorSupportInts.`3`]
  }
  
  trait ColorSupportOptions extends StObject {
    
    var alwaysReturn: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    var ignoreCI: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDumb: js.UndefOr[Boolean] = js.undefined
    
    var ignoreTTY: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[ColorSupportLevel] = js.undefined
    
    var stream: js.UndefOr[WriteStream] = js.undefined
    
    var term: js.UndefOr[String] = js.undefined
  }
  object ColorSupportOptions {
    
    inline def apply(): ColorSupportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorSupportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorSupportOptions] (val x: Self) extends AnyVal {
      
      inline def setAlwaysReturn(value: Boolean): Self = StObject.set(x, "alwaysReturn", value.asInstanceOf[js.Any])
      
      inline def setAlwaysReturnUndefined: Self = StObject.set(x, "alwaysReturn", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setIgnoreCI(value: Boolean): Self = StObject.set(x, "ignoreCI", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCIUndefined: Self = StObject.set(x, "ignoreCI", js.undefined)
      
      inline def setIgnoreDumb(value: Boolean): Self = StObject.set(x, "ignoreDumb", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDumbUndefined: Self = StObject.set(x, "ignoreDumb", js.undefined)
      
      inline def setIgnoreTTY(value: Boolean): Self = StObject.set(x, "ignoreTTY", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTTYUndefined: Self = StObject.set(x, "ignoreTTY", js.undefined)
      
      inline def setLevel(value: ColorSupportLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    }
  }
  
  trait ColorSupportResult extends StObject {
    
    var has16m: Boolean
    
    var has256: Boolean
    
    var hasBasic: Boolean
    
    var level: ColorSupportLevel
  }
  object ColorSupportResult {
    
    inline def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: ColorSupportLevel): ColorSupportResult = {
      val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSupportResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorSupportResult] (val x: Self) extends AnyVal {
      
      inline def setHas16m(value: Boolean): Self = StObject.set(x, "has16m", value.asInstanceOf[js.Any])
      
      inline def setHas256(value: Boolean): Self = StObject.set(x, "has256", value.asInstanceOf[js.Any])
      
      inline def setHasBasic(value: Boolean): Self = StObject.set(x, "hasBasic", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: ColorSupportLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ColorSupport
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ColorSupport = ^
}
