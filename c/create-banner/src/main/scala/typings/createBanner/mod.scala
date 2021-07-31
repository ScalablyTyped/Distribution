package typings.createBanner

import org.scalablytyped.runtime.StringDictionary
import typings.createBanner.anon._empty
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  @scala.inline
  def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("create-banner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BannerData
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    /**
      * @default new Date().toISOString()
      */
    var date: js.UndefOr[String] = js.undefined
    
    /**
      * @default new Date().getFullYear()
      */
    var year: js.UndefOr[String] = js.undefined
  }
  object BannerData {
    
    @scala.inline
    def apply(): BannerData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BannerData]
    }
    
    @scala.inline
    implicit class BannerDataMutableBuilder[Self <: BannerData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  // @credit @sindresorhus/type-fest
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] = LiteralType | (BaseType & _empty)
  
  trait Options extends StObject {
    
    /**
      * The case of the package name in the banner. Not to change the package name case by default.
      * @default ''
      */
    var `case`: js.UndefOr[
        LiteralUnion[
          `camel-case` | `capital-case` | `constant-case` | `dot-case` | `header-case` | `no-case` | `param-case` | `pascal-case` | `path-case` | `sentence-case` | `snake-case`, 
          String
        ]
      ] = js.undefined
    
    /**
      * The extra data for creating banner, will be merged into package data.
      */
    var data: js.UndefOr[BannerData] = js.undefined
    
    /**
      * The package data for creating banner.
      * If it is null, will read from the closest package.json file by default using the `read-pkg-up` package
      * @default null;
      */
    var pkg: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
    
    /**
      * The template for creating banner.
      * Property using a dot path is supported by the `dot-prop` package.
      * Other values will be used directly as a custom template.
      * @default 'normal'
      */
    var template: js.UndefOr[LiteralUnion[normal | simple | `inline`, String]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCase(
        value: LiteralUnion[
              `camel-case` | `capital-case` | `constant-case` | `dot-case` | `header-case` | `no-case` | `param-case` | `pascal-case` | `path-case` | `sentence-case` | `snake-case`, 
              String
            ]
      ): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseUndefined: Self = StObject.set(x, "case", js.undefined)
      
      @scala.inline
      def setData(value: BannerData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setPkg(value: StringDictionary[js.Any]): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgNull: Self = StObject.set(x, "pkg", null)
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      @scala.inline
      def setTemplate(value: LiteralUnion[normal | simple | `inline`, String]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  // @credit @sindresorhus/type-fest
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]
}
