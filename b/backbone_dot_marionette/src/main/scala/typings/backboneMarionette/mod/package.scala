package typings.backboneMarionette

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AppRoutes = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  @scala.inline
  def bindEvents(target: js.Any, entity: js.Any, bindings: js.Any): scala.Unit = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bindEvents")(target.asInstanceOf[js.Any], entity.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def bindRequests(target: js.Any, channel: typings.backboneRadio.mod.Channel_, bindings: js.Any): scala.Unit = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bindRequests")(target.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def extend(properties: js.Any): js.Any = typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def extend(properties: js.Any, classProperties: js.Any): js.Any = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getOption(target: js.Any, optionName: java.lang.String): js.Any = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(target.asInstanceOf[js.Any], optionName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def isNodeAttached(el: typings.std.HTMLElement): scala.Boolean = typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNodeAttached")(el.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def mergeOptions(target: js.Any, options: js.Any, keys: js.Any): scala.Unit = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def noConflict(): scala.Unit = typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def normalizeMethods[T](target: js.Any, hash: js.Any): T = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMethods")(target.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def triggerMethod(target: js.Any, name: java.lang.String, args: js.Any*): js.Any = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("triggerMethod")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def triggerMethodOn(ctx: js.Any, name: java.lang.String, args: js.Any*): js.Any = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("triggerMethodOn")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def unbindEvents(target: js.Any, entity: js.Any, bindings: js.Any): scala.Unit = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unbindEvents")(target.asInstanceOf[js.Any], entity.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unbindRequests(target: js.Any, channel: typings.backboneRadio.mod.Channel_, bindings: js.Any): scala.Unit = (typings.backboneMarionette.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unbindRequests")(target.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
