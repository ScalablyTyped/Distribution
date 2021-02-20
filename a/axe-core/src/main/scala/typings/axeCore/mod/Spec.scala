package typings.axeCore.mod

import typings.axeCore.anon.Application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spec extends StObject {
  
  var axeVersion: js.UndefOr[String] = js.native
  
  var branding: js.UndefOr[Application] = js.native
  
  var checks: js.UndefOr[js.Array[Check]] = js.native
  
  var disableOtherRules: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[Locale] = js.native
  
  var reporter: js.UndefOr[ReporterVersion] = js.native
  
  var rules: js.UndefOr[js.Array[Rule]] = js.native
  
  var standards: js.UndefOr[Standards] = js.native
  
  // Deprecated - do not use.
  var ver: js.UndefOr[String] = js.native
}
object Spec {
  
  @scala.inline
  def apply(): Spec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spec]
  }
  
  @scala.inline
  implicit class SpecMutableBuilder[Self <: Spec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxeVersion(value: String): Self = StObject.set(x, "axeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxeVersionUndefined: Self = StObject.set(x, "axeVersion", js.undefined)
    
    @scala.inline
    def setBranding(value: Application): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandingUndefined: Self = StObject.set(x, "branding", js.undefined)
    
    @scala.inline
    def setChecks(value: js.Array[Check]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
    
    @scala.inline
    def setChecksVarargs(value: Check*): Self = StObject.set(x, "checks", js.Array(value :_*))
    
    @scala.inline
    def setDisableOtherRules(value: Boolean): Self = StObject.set(x, "disableOtherRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOtherRulesUndefined: Self = StObject.set(x, "disableOtherRules", js.undefined)
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setReporter(value: ReporterVersion): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setStandards(value: Standards): Self = StObject.set(x, "standards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsUndefined: Self = StObject.set(x, "standards", js.undefined)
    
    @scala.inline
    def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerUndefined: Self = StObject.set(x, "ver", js.undefined)
  }
}
