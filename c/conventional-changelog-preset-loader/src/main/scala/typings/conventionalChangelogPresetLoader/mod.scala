package typings.conventionalChangelogPresetLoader

import typings.conventionalChangelogWriter.mod.Context
import typings.conventionalCommitsParser.mod.Commit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply(path: String): typings.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[typings.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context]]
  inline def apply(path: Config): typings.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[typings.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context]]
  
  @JSImport("conventional-changelog-preset-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object presetLoader {
    
    inline def apply(requireMethod: RequireMethod): Any = ^.asInstanceOf[js.Dynamic].apply(requireMethod.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("conventional-changelog-preset-loader", "presetLoader")
    @js.native
    val ^ : js.Any = js.native
    
    type RequireMethod = js.Function1[/* id */ String, Any]
  }
  
  type Builder = js.Function1[
    /* config */ js.Object & Config, 
    typings.conventionalChangelogCore.mod.Options.Config[Commit[String | Double | js.Symbol], Context]
  ]
  
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
    var name: String
  }
  object Config {
    
    inline def apply(name: String): Config = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
