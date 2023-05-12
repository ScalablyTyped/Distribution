package typings.ckeditorCkeditor5Indent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIndentconfigMod {
  
  trait IndentBlockConfig extends StObject {
    
    /**
      * An optional list of classes to use for indenting the editor content. If not set or set to an empty array, no classes will be used.
      * The {@link module:indent/indentconfig~IndentBlockConfig#unit `indentBlock.unit`} and
      * {@link module:indent/indentconfig~IndentBlockConfig#offset `indentBlock.offset`} properties will be used instead.
      *
      * @default undefined
      */
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The size of indentation {@link module:indent/indentconfig~IndentBlockConfig#unit units} for each indentation step.
      *
      * @default 40
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * The unit used for indentation {@link module:indent/indentconfig~IndentBlockConfig#offset}.
      *
      * @default 'px'
      */
    var unit: js.UndefOr[String] = js.undefined
  }
  object IndentBlockConfig {
    
    inline def apply(): IndentBlockConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndentBlockConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndentBlockConfig] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
}
