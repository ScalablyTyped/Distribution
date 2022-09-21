package typings.protobufjsEQaYEpP4.minimalDTsMod

import typings.protobufjsEQaYEpP4.minimalDTsMod.^
import typings.protobufjsEQaYEpP4.mod.Codegen
import typings.protobufjsEQaYEpP4.mod.IParseOptions
import typings.protobufjsEQaYEpP4.mod.IParserResult
import typings.protobufjsEQaYEpP4.mod.LoadCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def build: String = ^.asInstanceOf[js.Dynamic].selectDynamic("build").asInstanceOf[String]

inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]

inline def decoder(mtype: typings.protobufjsEQaYEpP4.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("decoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]

inline def encoder(mtype: typings.protobufjsEQaYEpP4.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("encoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]

inline def load(filename: String): js.Promise[typings.protobufjsEQaYEpP4.mod.Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.protobufjsEQaYEpP4.mod.Root]]
inline def load(filename: String, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: String, root: typings.protobufjsEQaYEpP4.mod.Root): js.Promise[typings.protobufjsEQaYEpP4.mod.Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.protobufjsEQaYEpP4.mod.Root]]
inline def load(filename: String, root: typings.protobufjsEQaYEpP4.mod.Root, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: js.Array[String]): js.Promise[typings.protobufjsEQaYEpP4.mod.Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.protobufjsEQaYEpP4.mod.Root]]
inline def load(filename: js.Array[String], callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: js.Array[String], root: typings.protobufjsEQaYEpP4.mod.Root): js.Promise[typings.protobufjsEQaYEpP4.mod.Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.protobufjsEQaYEpP4.mod.Root]]
inline def load(filename: js.Array[String], root: typings.protobufjsEQaYEpP4.mod.Root, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loadSync(filename: String): typings.protobufjsEQaYEpP4.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjsEQaYEpP4.mod.Root]
inline def loadSync(filename: String, root: typings.protobufjsEQaYEpP4.mod.Root): typings.protobufjsEQaYEpP4.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjsEQaYEpP4.mod.Root]
inline def loadSync(filename: js.Array[String]): typings.protobufjsEQaYEpP4.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjsEQaYEpP4.mod.Root]
inline def loadSync(filename: js.Array[String], root: typings.protobufjsEQaYEpP4.mod.Root): typings.protobufjsEQaYEpP4.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjsEQaYEpP4.mod.Root]

inline def parse(source: String): IParserResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[IParserResult]
inline def parse(source: String, options: IParseOptions): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IParserResult]
inline def parse(source: String, root: typings.protobufjsEQaYEpP4.mod.Root): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[IParserResult]
inline def parse(source: String, root: typings.protobufjsEQaYEpP4.mod.Root, options: IParseOptions): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IParserResult]

inline def verifier(mtype: typings.protobufjsEQaYEpP4.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("verifier")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
