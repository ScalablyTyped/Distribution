package typings.chromeRemoteInterface.mod

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
