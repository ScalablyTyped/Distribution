package typings.conventionalChangelogPresetLoader

import typings.conventionalChangelogWriter.mod.Context
import typings.conventionalCommitsParser.mod.Commit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    *
    * Will return whatever is exported by the preset package. That may be a
    * configuration object, a function, or a promise.
    *
    * @param path
    */
  @JSImport("conventional-changelog-preset-loader", JSImport.Namespace)
  @js.native
  def apply(path: String): typings.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context] = js.native
  @JSImport("conventional-changelog-preset-loader", JSImport.Namespace)
  @js.native
  def apply(path: Config): typings.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context] = js.native
  
  object presetLoader {
    
    @JSImport("conventional-changelog-preset-loader", "presetLoader")
    @js.native
    def apply(requireMethod: RequireMethod): js.Any = js.native
    
    type RequireMethod = js.Function1[/* id */ String, js.Any]
  }
  
  type Builder = js.Function1[
    /* config */ js.Object with Config, 
    typings.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context]
  ]
  
  @js.native
  trait Config extends StObject {
    
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
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
