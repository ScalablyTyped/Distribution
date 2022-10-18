package typings.base2PrettyPrintObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@base2/pretty-print-object/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prettyPrint(input: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def prettyPrint(input: Any, options: PrettyPrintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def prettyPrint(input: Any, options: PrettyPrintOptions, pad: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait PrettyPrintOptions extends StObject {
    
    /**
      * Whether to include the property prop of the object obj in the output.
      *
      * @param obj
      * @param prop
      */
    var filter: js.UndefOr[js.Function2[/* obj */ Any, /* prop */ String | js.Symbol | Double, Boolean]] = js.undefined
    
    /**
      * Preferred indentation.
      *
      * @default '\t'
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * When set, will inline values up to inlineCharacterLimit length for the sake of more terse output.
      */
    var inlineCharacterLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to false to get double-quoted strings.
      *
      * @default true
      */
    var singleQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Expected to return a string that transforms the string that resulted from stringifying obj[prop].
      * This can be used to detect special types of objects that need to be stringified in a particular way.
      * The transform function might return an alternate string in this case, otherwise returning the originalResult.
      *
      * @param obj
      * @param prop
      * @param originalResult
      */
    var transform: js.UndefOr[
        js.Function3[
          /* obj */ Any, 
          /* prop */ String | js.Symbol | Double, 
          /* originalResult */ String, 
          String
        ]
      ] = js.undefined
  }
  object PrettyPrintOptions {
    
    inline def apply(): PrettyPrintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyPrintOptions]
    }
    
    extension [Self <: PrettyPrintOptions](x: Self) {
      
      inline def setFilter(value: (/* obj */ Any, /* prop */ String | js.Symbol | Double) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setInlineCharacterLimit(value: Double): Self = StObject.set(x, "inlineCharacterLimit", value.asInstanceOf[js.Any])
      
      inline def setInlineCharacterLimitUndefined: Self = StObject.set(x, "inlineCharacterLimit", js.undefined)
      
      inline def setSingleQuotes(value: Boolean): Self = StObject.set(x, "singleQuotes", value.asInstanceOf[js.Any])
      
      inline def setSingleQuotesUndefined: Self = StObject.set(x, "singleQuotes", js.undefined)
      
      inline def setTransform(
        value: (/* obj */ Any, /* prop */ String | js.Symbol | Double, /* originalResult */ String) => String
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
