package typings.colorSupport

import org.scalablytyped.runtime.Shortcut
import typings.colorSupport.colorSupportBooleans.`false`
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    - typings.colorSupport.colorSupportNumbers.`0`
    - typings.colorSupport.colorSupportNumbers.`1`
    - typings.colorSupport.colorSupportNumbers.`2`
    - typings.colorSupport.colorSupportNumbers.`3`
  */
  trait ColorSupportLevel extends StObject
  object ColorSupportLevel {
    
    @scala.inline
    def `0`: typings.colorSupport.colorSupportNumbers.`0` = 0.asInstanceOf[typings.colorSupport.colorSupportNumbers.`0`]
    
    @scala.inline
    def `1`: typings.colorSupport.colorSupportNumbers.`1` = 1.asInstanceOf[typings.colorSupport.colorSupportNumbers.`1`]
    
    @scala.inline
    def `2`: typings.colorSupport.colorSupportNumbers.`2` = 2.asInstanceOf[typings.colorSupport.colorSupportNumbers.`2`]
    
    @scala.inline
    def `3`: typings.colorSupport.colorSupportNumbers.`3` = 3.asInstanceOf[typings.colorSupport.colorSupportNumbers.`3`]
  }
  
  @js.native
  trait ColorSupportOptions extends StObject {
    
    var alwaysReturn: js.UndefOr[Boolean] = js.native
    
    var env: js.UndefOr[ProcessEnv] = js.native
    
    var ignoreCI: js.UndefOr[Boolean] = js.native
    
    var ignoreDumb: js.UndefOr[Boolean] = js.native
    
    var ignoreTTY: js.UndefOr[Boolean] = js.native
    
    var level: js.UndefOr[ColorSupportLevel] = js.native
    
    var stream: js.UndefOr[WriteStream] = js.native
    
    var term: js.UndefOr[String] = js.native
  }
  object ColorSupportOptions {
    
    @scala.inline
    def apply(): ColorSupportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorSupportOptions]
    }
    
    @scala.inline
    implicit class ColorSupportOptionsMutableBuilder[Self <: ColorSupportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysReturn(value: Boolean): Self = StObject.set(x, "alwaysReturn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysReturnUndefined: Self = StObject.set(x, "alwaysReturn", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setIgnoreCI(value: Boolean): Self = StObject.set(x, "ignoreCI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCIUndefined: Self = StObject.set(x, "ignoreCI", js.undefined)
      
      @scala.inline
      def setIgnoreDumb(value: Boolean): Self = StObject.set(x, "ignoreDumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDumbUndefined: Self = StObject.set(x, "ignoreDumb", js.undefined)
      
      @scala.inline
      def setIgnoreTTY(value: Boolean): Self = StObject.set(x, "ignoreTTY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTTYUndefined: Self = StObject.set(x, "ignoreTTY", js.undefined)
      
      @scala.inline
      def setLevel(value: ColorSupportLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    }
  }
  
  @js.native
  trait ColorSupportResult extends StObject {
    
    var has16m: Boolean = js.native
    
    var has256: Boolean = js.native
    
    var hasBasic: Boolean = js.native
    
    var level: ColorSupportLevel = js.native
  }
  object ColorSupportResult {
    
    @scala.inline
    def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: ColorSupportLevel): ColorSupportResult = {
      val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSupportResult]
    }
    
    @scala.inline
    implicit class ColorSupportResultMutableBuilder[Self <: ColorSupportResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHas16m(value: Boolean): Self = StObject.set(x, "has16m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas256(value: Boolean): Self = StObject.set(x, "has256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBasic(value: Boolean): Self = StObject.set(x, "hasBasic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: ColorSupportLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ColorSupport
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ColorSupport = ^
}
