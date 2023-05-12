package typings.csstoolsCascadeLayerNameParser

import typings.csstoolsCascadeLayerNameParser.distParserParseMod.Options
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@csstools/cascade-layer-name-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/cascade-layer-name-parser", "LayerName")
  @js.native
  open class LayerName protected ()
    extends typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName {
    def this(parts: js.Array[CSSToken]) = this()
  }
  
  inline def addLayerToModel(
    layers: js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName],
    currentLayerNames: js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName]
  ): js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName] = (^.asInstanceOf[js.Dynamic].applyDynamic("addLayerToModel")(layers.asInstanceOf[js.Any], currentLayerNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName]]
  
  inline def parse(source: String): js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName]]
  inline def parse(source: String, options: Options): js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName]]
  
  inline def parseFromTokens(tokens: js.Array[CSSToken]): js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName]]
  inline def parseFromTokens(tokens: js.Array[CSSToken], options: Options): js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromTokens")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName]]
}
