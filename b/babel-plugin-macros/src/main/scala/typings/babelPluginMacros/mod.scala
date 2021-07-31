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
  
  @scala.inline
  def apply(babel: TypeofBabel, options: js.Any): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].apply(babel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  
  @JSImport("babel-plugin-macros", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babel-plugin-macros", "MacroError")
  @js.native
  class MacroError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @scala.inline
  def createMacro(handler: MacroHandler): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createMacro")(handler.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createMacro(handler: MacroHandler, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createMacro")(handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type MacroHandler = js.Function1[/* params */ MacroParams, Unit]
  
  trait MacroParams extends StObject {
    
    var babel: TypeofBabel
    
    var config: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var references: defaultArrayNodePathNodeR
    
    var state: PluginPass
  }
  object MacroParams {
    
    @scala.inline
    def apply(babel: TypeofBabel, references: defaultArrayNodePathNodeR, state: PluginPass): MacroParams = {
      val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacroParams]
    }
    
    @scala.inline
    implicit class MacroParamsMutableBuilder[Self <: MacroParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabel(value: TypeofBabel): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setReferences(value: defaultArrayNodePathNodeR): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: PluginPass): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var configName: js.UndefOr[String] = js.undefined
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
      def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
    }
  }
  
  type References = StringDictionary[js.Array[NodePath[Node]]]
}
