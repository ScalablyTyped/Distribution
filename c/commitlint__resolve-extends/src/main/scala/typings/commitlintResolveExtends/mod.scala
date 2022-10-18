package typings.commitlintResolveExtends

import typings.commitlintResolveExtends.anon.Cwd
import typings.commitlintTypes.libLoadMod.UserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commitlint/resolve-extends", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): UserConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[UserConfig]
  inline def default(config: Unit, context: ResolveExtendsContext): UserConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UserConfig]
  inline def default(config: UserConfig): UserConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[UserConfig]
  inline def default(config: UserConfig, context: ResolveExtendsContext): UserConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UserConfig]
  
  trait ResolveExtendsContext extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var parserPreset: js.UndefOr[Any] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var require: js.UndefOr[js.Function1[/* id */ String, Any]] = js.undefined
    
    var resolve: js.UndefOr[js.Function2[/* id */ String, /* ctx */ js.UndefOr[Cwd], String]] = js.undefined
    
    var resolveGlobal: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  }
  object ResolveExtendsContext {
    
    inline def apply(): ResolveExtendsContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveExtendsContext]
    }
    
    extension [Self <: ResolveExtendsContext](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setParserPreset(value: Any): Self = StObject.set(x, "parserPreset", value.asInstanceOf[js.Any])
      
      inline def setParserPresetUndefined: Self = StObject.set(x, "parserPreset", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRequire(value: /* id */ String => Any): Self = StObject.set(x, "require", js.Any.fromFunction1(value))
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setResolve(value: (/* id */ String, /* ctx */ js.UndefOr[Cwd]) => String): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
      
      inline def setResolveGlobal(value: /* id */ String => String): Self = StObject.set(x, "resolveGlobal", js.Any.fromFunction1(value))
      
      inline def setResolveGlobalUndefined: Self = StObject.set(x, "resolveGlobal", js.undefined)
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
}
