package typings.browserify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Core options pertaining to a Browserify instance, extended by user options
  */
@js.native
trait CustomOptions
  extends /**
  * Custom properties can be defined on Options.
  * These options are forwarded along to module-deps and browser-pack directly.
  */
/* propName */ StringDictionary[js.Any] {
  
  /** the directory that Browserify starts bundling from for filenames that start with .. */
  var basedir: js.UndefOr[String] = js.native
}
object CustomOptions {
  
  @scala.inline
  def apply(): CustomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomOptions]
  }
  
  @scala.inline
  implicit class CustomOptionsOps[Self <: CustomOptions] (val x: Self) extends AnyVal {
    
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
    def setBasedir(value: String): Self = this.set("basedir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedir: Self = this.set("basedir", js.undefined)
  }
}
