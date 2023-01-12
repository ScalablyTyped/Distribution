package typings.bunyanDebugStream

import typings.bunyanDebugStream.bunyanDebugStreamStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExceptionUtilsMod {
  
  @JSImport("bunyan-debug-stream/lib/exceptionUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatException(err: String, options: ColorExceptionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatException")(err.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatException(err: js.Error, options: ColorExceptionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatException")(err.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ColorExceptionOptions extends StObject {
    
    /**
      * basePath is used to determine whether a file is part of this project
      * or not.  If it is not set, then all files are considered part of the
      * project.
      */
    var basePath: js.UndefOr[String] = js.undefined
    
    var basePathReplacement: js.UndefOr[String] = js.undefined
    
    /**
      * True to enable ANSI colors.
      */
    var color: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of lines of stack trace to show. undefined for unlimited.
      * "auto" truncate after "own" code.
      */
    var maxLines: js.UndefOr[Double | auto] = js.undefined
  }
  object ColorExceptionOptions {
    
    inline def apply(): ColorExceptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorExceptionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorExceptionOptions] (val x: Self) extends AnyVal {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathReplacement(value: String): Self = StObject.set(x, "basePathReplacement", value.asInstanceOf[js.Any])
      
      inline def setBasePathReplacementUndefined: Self = StObject.set(x, "basePathReplacement", js.undefined)
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setMaxLines(value: Double | auto): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    }
  }
}
