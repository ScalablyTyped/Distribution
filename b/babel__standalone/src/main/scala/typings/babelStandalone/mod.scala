package typings.babelStandalone

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.mod.BabelFileResult
import typings.babelCore.mod.FileResultCallback
import typings.babelCore.mod.TransformOptions
import typings.babelTypes.mod.Node
import typings.std.HTMLCollection
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@babel/standalone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@babel/standalone", "availablePlugins")
  @js.native
  val availablePlugins: Record[String, js.Object | js.Function0[Unit]] = js.native
  
  @JSImport("@babel/standalone", "availablePresets")
  @js.native
  val availablePresets: Record[String, js.Object | js.Function0[Unit]] = js.native
  
  @scala.inline
  def disableScriptTags(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableScriptTags")().asInstanceOf[Unit]
  
  @scala.inline
  def registerPlugin(name: String, plugin: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def registerPlugin(name: String, plugin: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerPlugins(newPlugins: StringDictionary[js.Object | js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugins")(newPlugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerPreset(name: String, preset: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreset")(name.asInstanceOf[js.Any], preset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def registerPreset(name: String, preset: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreset")(name.asInstanceOf[js.Any], preset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerPresets(newPresets: StringDictionary[js.Object | js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPresets")(newPresets.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def transform(code: String, options: TransformOptions): BabelFileResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult]
  
  @scala.inline
  def transformFromAst(ast: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def transformFromAst(ast: Node, code: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def transformFromAst(ast: Node, code: String, opts: Unit, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def transformFromAst(ast: Node, code: String, opts: TransformOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def transformFromAst(ast: Node, code: String, opts: TransformOptions, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def transformFromAst(ast: Node, code: Unit, opts: Unit, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def transformFromAst(ast: Node, code: Unit, opts: TransformOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def transformFromAst(ast: Node, code: Unit, opts: TransformOptions, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def transformScriptTags(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("transformScriptTags")().asInstanceOf[Unit]
  @scala.inline
  def transformScriptTags(scriptTags: HTMLCollection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("transformScriptTags")(scriptTags.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
