package typings.babelPluginMacros

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.mod.NodePath
import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginPass
import typings.babelPluginMacros.anon.TypeofBabel
import typings.babelPluginMacros.anon.defaultArrayNodePathNodeR
import typings.babelTypes.mod.Node
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(babel: TypeofBabel, options: Any): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].apply(babel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  
  @JSImport("babel-plugin-macros", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babel-plugin-macros", "MacroError")
  @js.native
  open class MacroError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def createMacro(handler: MacroHandler): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createMacro")(handler.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createMacro(handler: MacroHandler, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createMacro")(handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type MacroHandler = js.Function1[/* params */ MacroParams, Unit]
  
  trait MacroParams extends StObject {
    
    var babel: TypeofBabel
    
    var config: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var isBabelMacrosCall: Boolean
    
    var references: defaultArrayNodePathNodeR
    
    var source: String
    
    var state: PluginPass
  }
  object MacroParams {
    
    inline def apply(
      babel: TypeofBabel,
      isBabelMacrosCall: Boolean,
      references: defaultArrayNodePathNodeR,
      source: String,
      state: PluginPass
    ): MacroParams = {
      val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any], isBabelMacrosCall = isBabelMacrosCall.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacroParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MacroParams] (val x: Self) extends AnyVal {
      
      inline def setBabel(value: TypeofBabel): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: StringDictionary[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setIsBabelMacrosCall(value: Boolean): Self = StObject.set(x, "isBabelMacrosCall", value.asInstanceOf[js.Any])
      
      inline def setReferences(value: defaultArrayNodePathNodeR): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setState(value: PluginPass): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var configName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      inline def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
    }
  }
  
  type References = StringDictionary[js.Array[NodePath[Node]]]
}
