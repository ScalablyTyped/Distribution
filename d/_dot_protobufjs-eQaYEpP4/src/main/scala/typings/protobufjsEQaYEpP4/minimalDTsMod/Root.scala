package typings.protobufjsEQaYEpP4.minimalDTsMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjsEQaYEpP4.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".protobufjs-eQaYEpP4/minimal.d.ts", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
open class Root ()
  extends typings.protobufjsEQaYEpP4.mod.Root {
  def this(options: StringDictionary[Any]) = this()
}
/* static members */
object Root {
  
  @JSImport(".protobufjs-eQaYEpP4/minimal.d.ts", "Root")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  inline def fromJSON(json: INamespace): typings.protobufjsEQaYEpP4.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjsEQaYEpP4.mod.Root]
  inline def fromJSON(json: INamespace, root: typings.protobufjsEQaYEpP4.mod.Root): typings.protobufjsEQaYEpP4.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjsEQaYEpP4.mod.Root]
}
