package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spec extends StObject {
  
  var allowedOrigins: js.UndefOr[js.Array[String]] = js.undefined
  
  var axeVersion: js.UndefOr[String] = js.undefined
  
  var branding: js.UndefOr[String | Branding] = js.undefined
  
  var checks: js.UndefOr[js.Array[Check]] = js.undefined
  
  var disableOtherRules: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[Locale] = js.undefined
  
  var noHtml: js.UndefOr[Boolean] = js.undefined
  
  var reporter: js.UndefOr[ReporterVersion] = js.undefined
  
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  
  var standards: js.UndefOr[Standards] = js.undefined
  
  // Deprecated - do not use.
  var ver: js.UndefOr[String] = js.undefined
}
object Spec {
  
  inline def apply(): Spec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spec]
  }
  
  extension [Self <: Spec](x: Self) {
    
    inline def setAllowedOrigins(value: js.Array[String]): Self = StObject.set(x, "allowedOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowedOriginsUndefined: Self = StObject.set(x, "allowedOrigins", js.undefined)
    
    inline def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "allowedOrigins", js.Array(value*))
    
    inline def setAxeVersion(value: String): Self = StObject.set(x, "axeVersion", value.asInstanceOf[js.Any])
    
    inline def setAxeVersionUndefined: Self = StObject.set(x, "axeVersion", js.undefined)
    
    inline def setBranding(value: String | Branding): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    inline def setBrandingUndefined: Self = StObject.set(x, "branding", js.undefined)
    
    inline def setChecks(value: js.Array[Check]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
    
    inline def setChecksVarargs(value: Check*): Self = StObject.set(x, "checks", js.Array(value*))
    
    inline def setDisableOtherRules(value: Boolean): Self = StObject.set(x, "disableOtherRules", value.asInstanceOf[js.Any])
    
    inline def setDisableOtherRulesUndefined: Self = StObject.set(x, "disableOtherRules", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNoHtml(value: Boolean): Self = StObject.set(x, "noHtml", value.asInstanceOf[js.Any])
    
    inline def setNoHtmlUndefined: Self = StObject.set(x, "noHtml", js.undefined)
    
    inline def setReporter(value: ReporterVersion): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setStandards(value: Standards): Self = StObject.set(x, "standards", value.asInstanceOf[js.Any])
    
    inline def setStandardsUndefined: Self = StObject.set(x, "standards", js.undefined)
    
    inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
    
    inline def setVerUndefined: Self = StObject.set(x, "ver", js.undefined)
  }
}
