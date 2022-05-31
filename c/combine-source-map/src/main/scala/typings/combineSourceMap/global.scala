package typings.combineSourceMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Combiner {
    
    @JSGlobal("Combiner")
    @js.native
    class ^ ()
      extends typings.combineSourceMap.mod.^ {
      def this(file: String) = this()
      def this(file: String, sourceRoot: String) = this()
      def this(file: Unit, sourceRoot: String) = this()
    }
    
    @JSGlobal("Combiner")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a source map combiner that accepts multiple files, offsets them and then combines them into one source map.
      * @param file optional name of the generated file
      * @param sourceRoot optional sourceRoot of the map to be generated
      * @return Combiner instance to which source maps can be added and later combined
      */
    inline def create(): typings.combineSourceMap.mod.Combiner = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.combineSourceMap.mod.Combiner]
    inline def create(file: String): typings.combineSourceMap.mod.Combiner = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any]).asInstanceOf[typings.combineSourceMap.mod.Combiner]
    inline def create(file: String, sourceRoot: String): typings.combineSourceMap.mod.Combiner = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any], sourceRoot.asInstanceOf[js.Any])).asInstanceOf[typings.combineSourceMap.mod.Combiner]
    inline def create(file: Unit, sourceRoot: String): typings.combineSourceMap.mod.Combiner = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any], sourceRoot.asInstanceOf[js.Any])).asInstanceOf[typings.combineSourceMap.mod.Combiner]
    
    /**
      * @return src with all sourceMappingUrl comments removed
      */
    inline def removeComments(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeComments")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
