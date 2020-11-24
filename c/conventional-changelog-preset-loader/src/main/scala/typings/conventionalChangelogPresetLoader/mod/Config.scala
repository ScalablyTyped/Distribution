package typings.conventionalChangelogPresetLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  /**
    * The string that is passed to the preset loader is manipulated by prepending
    * `conventional-changelog` to the name.
    *
    * For example:
    *
    * * `angular` => `conventional-changelog-angular`
    * * `angular/preset/path` => `conventional-changelog-angular/preset/path`
    * * `@scope/angular` => `@scope/conventional-changelog-angular`
    * * `@scope/angular/preset/path` => `@scope/conventional-changelog-angular/preset/path`
    */
  var name: String = js.native
}
object Config {
  
  @scala.inline
  def apply(name: String): Config = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
