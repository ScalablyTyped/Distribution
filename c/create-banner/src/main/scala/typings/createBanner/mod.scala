package typings.createBanner

import typings.createBanner.anon.Dictkey
import typings.createBanner.createBannerStrings._empty
import typings.createBanner.createBannerStrings.`camel-case`
import typings.createBanner.createBannerStrings.`capital-case`
import typings.createBanner.createBannerStrings.`constant-case`
import typings.createBanner.createBannerStrings.`dot-case`
import typings.createBanner.createBannerStrings.`header-case`
import typings.createBanner.createBannerStrings.`inline`
import typings.createBanner.createBannerStrings.`no-case`
import typings.createBanner.createBannerStrings.`param-case`
import typings.createBanner.createBannerStrings.`pascal-case`
import typings.createBanner.createBannerStrings.`path-case`
import typings.createBanner.createBannerStrings.`sentence-case`
import typings.createBanner.createBannerStrings.`snake-case`
import typings.createBanner.createBannerStrings.normal
import typings.createBanner.createBannerStrings.simple
import typings.readPkg.mod.NormalizedPackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-banner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(options: CreateBannerOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait CreateBannerOptions extends StObject {
    
    var `case`: js.UndefOr[
        `camel-case` | `capital-case` | `constant-case` | `dot-case` | `header-case` | `no-case` | `param-case` | `pascal-case` | `path-case` | `sentence-case` | `snake-case` | _empty
      ] = js.undefined
    
    var data: js.UndefOr[Dictkey] = js.undefined
    
    var pkg: js.UndefOr[NormalizedPackageJson] = js.undefined
    
    var template: js.UndefOr[normal | simple | `inline` | String] = js.undefined
  }
  object CreateBannerOptions {
    
    inline def apply(): CreateBannerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateBannerOptions]
    }
    
    extension [Self <: CreateBannerOptions](x: Self) {
      
      inline def setCase(
        value: `camel-case` | `capital-case` | `constant-case` | `dot-case` | `header-case` | `no-case` | `param-case` | `pascal-case` | `path-case` | `sentence-case` | `snake-case` | _empty
      ): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
      
      inline def setCaseUndefined: Self = StObject.set(x, "case", js.undefined)
      
      inline def setData(value: Dictkey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPkg(value: NormalizedPackageJson): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setTemplate(value: normal | simple | `inline` | String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
