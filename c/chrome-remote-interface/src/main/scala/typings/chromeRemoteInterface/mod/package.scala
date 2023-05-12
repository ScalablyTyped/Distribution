package typings.chromeRemoteInterface.mod

import typings.chromeRemoteInterface.chromeRemoteInterfaceBooleans.`true`
import typings.chromeRemoteInterface.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Client]]
inline def apply(callback: js.Function1[/* client */ Client, Unit]): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def apply(options: Options): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
inline def apply(options: Options, callback: js.Function1[/* client */ Client, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def Activate(options: ActivateOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Activate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def Activate(options: ActivateOptions, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Activate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def Close(options: CloseOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Close")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def Close(options: CloseOptions, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Close")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def List(): js.Promise[js.Array[Target]] = ^.asInstanceOf[js.Dynamic].applyDynamic("List")().asInstanceOf[js.Promise[js.Array[Target]]]
inline def List(callback: js.Function2[/* err */ js.Error | Null, /* targets */ js.Array[Target], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("List")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def List(options: BaseOptions): js.Promise[js.Array[Target]] = ^.asInstanceOf[js.Dynamic].applyDynamic("List")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Target]]]
inline def List(
  options: BaseOptions,
  callback: js.Function2[/* err */ js.Error | Null, /* targets */ js.Array[Target], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("List")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def New(): js.Promise[Target] = ^.asInstanceOf[js.Dynamic].applyDynamic("New")().asInstanceOf[js.Promise[Target]]
inline def New(callback: js.Function2[/* err */ js.Error | Null, /* target */ Target, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("New")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def New(options: NewOptions): js.Promise[Target] = ^.asInstanceOf[js.Dynamic].applyDynamic("New")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Target]]
inline def New(options: NewOptions, callback: js.Function2[/* err */ js.Error | Null, /* target */ Target, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("New")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  D extends string ? chrome-remote-interface.chrome-remote-interface.DoEventPromises<D> & chrome-remote-interface.chrome-remote-interface.DoEventListeners<D> : {}
  }}}
  */
type DoEventObj[D] = DoEventPromises[D] & DoEventListeners[D]

type GetEvent[D /* <: String */] = GetEventFromString[
D, 
/* keyof devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Events */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 185, starting with typings.chromeRemoteInterface.chromeRemoteInterfaceStrings.ConsoleDotmessageAdded, typings.chromeRemoteInterface.chromeRemoteInterfaceStrings.DebuggerDotbreakpointResolved, typings.chromeRemoteInterface.chromeRemoteInterfaceStrings.DebuggerDotpaused */ Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  std.Record<keyof T, undefined> extends T ? true : false
  }}}
  */
type IsNullableObj[T] = `true`
