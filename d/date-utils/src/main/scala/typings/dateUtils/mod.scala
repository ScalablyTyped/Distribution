package typings.dateUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def language(lang: LanguageType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("language")(lang.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.dateUtils.dateUtilsStrings.es
    - typings.dateUtils.dateUtilsStrings.fr
    - typings.dateUtils.dateUtilsStrings.`pt-BR`
  */
  trait LanguageType extends StObject
  object LanguageType {
    
    inline def es: typings.dateUtils.dateUtilsStrings.es = "es".asInstanceOf[typings.dateUtils.dateUtilsStrings.es]
    
    inline def fr: typings.dateUtils.dateUtilsStrings.fr = "fr".asInstanceOf[typings.dateUtils.dateUtilsStrings.fr]
    
    inline def `pt-BR`: typings.dateUtils.dateUtilsStrings.`pt-BR` = "pt-BR".asInstanceOf[typings.dateUtils.dateUtilsStrings.`pt-BR`]
  }
}
