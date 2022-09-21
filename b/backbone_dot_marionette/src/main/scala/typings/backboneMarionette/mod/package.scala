package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StringDictionary
import typings.backboneMarionette.mod.^
import typings.backboneRadio.mod.Channel_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def bindEvents(target: Any, entity: Any, bindings: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindEvents")(target.asInstanceOf[js.Any], entity.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def bindRequests(target: Any, channel: Channel_, bindings: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindRequests")(target.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def extend(properties: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def extend(properties: Any, classProperties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getOption(target: Any, optionName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(target.asInstanceOf[js.Any], optionName.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def isNodeAttached(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeAttached")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def mergeOptions(target: Any, options: Any, keys: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def noConflict(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Unit]

inline def normalizeMethods[T](target: Any, hash: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMethods")(target.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[T]

inline def triggerMethod(target: Any, name: String, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerMethod")((List(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]

inline def triggerMethodOn(ctx: Any, name: String, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerMethodOn")((List(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]

inline def unbindEvents(target: Any, entity: Any, bindings: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbindEvents")(target.asInstanceOf[js.Any], entity.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unbindRequests(target: Any, channel: Channel_, bindings: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbindRequests")(target.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[Unit]

type AppRoutes = StringDictionary[String]
