package typings.chalk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object supportsColorMod {
  
  @JSImport("chalk/source/vendor/supports-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("chalk/source/vendor/supports-color", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chalk/source/vendor/supports-color", "default.stderr")
    @js.native
    def stderr: ColorInfo = js.native
    inline def stderr_=(x: ColorInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stderr")(x.asInstanceOf[js.Any])
    
    @JSImport("chalk/source/vendor/supports-color", "default.stdout")
    @js.native
    def stdout: ColorInfo = js.native
    inline def stdout_=(x: ColorInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stdout")(x.asInstanceOf[js.Any])
  }
  
  inline def createSupportsColor(
    stream: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WriteStream */ Any
  ): ColorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createSupportsColor")(stream.asInstanceOf[js.Any]).asInstanceOf[ColorInfo]
  inline def createSupportsColor(
    stream: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WriteStream */ Any,
    options: Options
  ): ColorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("createSupportsColor")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ColorInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalk.supportsColorMod.ColorSupport
    - typings.chalk.chalkBooleans.`false`
  */
  trait ColorInfo extends StObject
  
  trait ColorSupport
    extends StObject
       with ColorInfo {
    
    /**
    	Whether Truecolor 16 million colors are supported.
    	*/
    var has16m: Boolean
    
    /**
    	Whether ANSI 256 colors are supported.
    	*/
    var has256: Boolean
    
    /**
    	Whether basic 16 colors are supported.
    	*/
    var hasBasic: Boolean
    
    /**
    	The color level.
    	*/
    var level: ColorSupportLevel
  }
  object ColorSupport {
    
    inline def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: ColorSupportLevel): ColorSupport = {
      val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSupport]
    }
    
    extension [Self <: ColorSupport](x: Self) {
      
      inline def setHas16m(value: Boolean): Self = StObject.set(x, "has16m", value.asInstanceOf[js.Any])
      
      inline def setHas256(value: Boolean): Self = StObject.set(x, "has256", value.asInstanceOf[js.Any])
      
      inline def setHasBasic(value: Boolean): Self = StObject.set(x, "hasBasic", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: ColorSupportLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalk.chalkInts.`0`
    - typings.chalk.chalkInts.`1`
    - typings.chalk.chalkInts.`2`
    - typings.chalk.chalkInts.`3`
  */
  trait ColorSupportLevel extends StObject
  object ColorSupportLevel {
    
    inline def `0`: typings.chalk.chalkInts.`0` = 0.asInstanceOf[typings.chalk.chalkInts.`0`]
    
    inline def `1`: typings.chalk.chalkInts.`1` = 1.asInstanceOf[typings.chalk.chalkInts.`1`]
    
    inline def `2`: typings.chalk.chalkInts.`2` = 2.asInstanceOf[typings.chalk.chalkInts.`2`]
    
    inline def `3`: typings.chalk.chalkInts.`3` = 3.asInstanceOf[typings.chalk.chalkInts.`3`]
  }
  
  trait Options extends StObject {
    
    /**
    	Whether `process.argv` should be sniffed for `--color` and `--no-color` flags.
    	@default true
    	*/
    val sniffFlags: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSniffFlags(value: Boolean): Self = StObject.set(x, "sniffFlags", value.asInstanceOf[js.Any])
      
      inline def setSniffFlagsUndefined: Self = StObject.set(x, "sniffFlags", js.undefined)
    }
  }
}
