package typings.createBanner.mod

import org.scalablytyped.runtime.StringDictionary
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The case of the package name in the banner. Not to change the package name case by default.
    * @default ''
    */
  var `case`: js.UndefOr[
    LiteralUnion[
      `camel-case` | `capital-case` | `constant-case` | `dot-case` | `header-case` | `no-case` | `param-case` | `pascal-case` | `path-case` | `sentence-case` | `snake-case`, 
      String
    ]
  ] = js.native
  
  /**
    * The extra data for creating banner, will be merged into package data.
    */
  var data: js.UndefOr[BannerData] = js.native
  
  /**
    * The package data for creating banner.
    * If it is null, will read from the closest package.json file by default using the `read-pkg-up` package
    * @default null;
    */
  var pkg: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  
  /**
    * The template for creating banner.
    * Property using a dot path is supported by the `dot-prop` package.
    * Other values will be used directly as a custom template.
    * @default 'normal'
    */
  var template: js.UndefOr[LiteralUnion[normal | simple | `inline`, String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCase(
      value: LiteralUnion[
          `camel-case` | `capital-case` | `constant-case` | `dot-case` | `header-case` | `no-case` | `param-case` | `pascal-case` | `path-case` | `sentence-case` | `snake-case`, 
          String
        ]
    ): Self = this.set("case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCase: Self = this.set("case", js.undefined)
    
    @scala.inline
    def setData(value: BannerData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setPkg(value: StringDictionary[js.Any]): Self = this.set("pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    
    @scala.inline
    def setPkgNull: Self = this.set("pkg", null)
    
    @scala.inline
    def setTemplate(value: LiteralUnion[normal | simple | `inline`, String]): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
