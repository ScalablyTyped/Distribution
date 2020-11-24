package typings.depcheck.mod

import org.scalablytyped.runtime.StringDictionary
import typings.depcheck.anon.Dependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  @JSName("package")
  var _package: js.UndefOr[Dependencies] = js.native
  
  var detectors: js.UndefOr[js.Array[Detector_]] = js.native
  
  var ignoreBinPackage: js.UndefOr[Boolean] = js.native
  
  var ignoreDirs: js.UndefOr[js.Array[String]] = js.native
  
  var ignoreMatches: js.UndefOr[js.Array[String]] = js.native
  
  var parsers: js.UndefOr[StringDictionary[Parser_]] = js.native
  
  var skipMissing: js.UndefOr[Boolean] = js.native
  
  var specials: js.UndefOr[js.Array[Parser_]] = js.native
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
    def set_package(value: Dependencies): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def setDetectorsVarargs(value: Detector_ *): Self = this.set("detectors", js.Array(value :_*))
    
    @scala.inline
    def setDetectors(value: js.Array[Detector_]): Self = this.set("detectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectors: Self = this.set("detectors", js.undefined)
    
    @scala.inline
    def setIgnoreBinPackage(value: Boolean): Self = this.set("ignoreBinPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreBinPackage: Self = this.set("ignoreBinPackage", js.undefined)
    
    @scala.inline
    def setIgnoreDirsVarargs(value: String*): Self = this.set("ignoreDirs", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreDirs(value: js.Array[String]): Self = this.set("ignoreDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDirs: Self = this.set("ignoreDirs", js.undefined)
    
    @scala.inline
    def setIgnoreMatchesVarargs(value: String*): Self = this.set("ignoreMatches", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreMatches(value: js.Array[String]): Self = this.set("ignoreMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreMatches: Self = this.set("ignoreMatches", js.undefined)
    
    @scala.inline
    def setParsers(value: StringDictionary[Parser_]): Self = this.set("parsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsers: Self = this.set("parsers", js.undefined)
    
    @scala.inline
    def setSkipMissing(value: Boolean): Self = this.set("skipMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipMissing: Self = this.set("skipMissing", js.undefined)
    
    @scala.inline
    def setSpecialsVarargs(value: Parser_ *): Self = this.set("specials", js.Array(value :_*))
    
    @scala.inline
    def setSpecials(value: js.Array[Parser_]): Self = this.set("specials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecials: Self = this.set("specials", js.undefined)
  }
}
