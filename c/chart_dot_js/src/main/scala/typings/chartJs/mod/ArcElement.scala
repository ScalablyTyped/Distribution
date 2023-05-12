package typings.chartJs.mod

import typings.chartJs.anon.Angle
import typings.chartJs.anon.BackgroundColor
import typings.chartJs.anon.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.chartJs.distCoreCoreDotelementMod.Element because Already inherited
- typings.chartJs.distCoreCoreDotelementMod.default because Already inherited
- typings.chartJs.distElementsElementDotarcMod.ArcElement because Already inherited
- typings.chartJs.distElementsElementDotarcMod.default because Already inherited
- typings.chartJs.distTypesIndexMod.ArcElement because Inheritance from two classes. Inlined  */ @JSImport("chart.js", "ArcElement")
@js.native
open class ArcElement protected ()
  extends typings.chartJs.distMod.ArcElement {
  def this(cfg: Any) = this()
}
/* static members */
object ArcElement {
  
  @JSImport("chart.js", "ArcElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js", "ArcElement.defaultRoutes")
  @js.native
  def defaultRoutes: BackgroundColor = js.native
  inline def defaultRoutes_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "ArcElement.defaults")
  @js.native
  def defaults: Angle = js.native
  inline def defaults_=(x: Angle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "ArcElement.descriptors")
  @js.native
  def descriptors: Indexable = js.native
  inline def descriptors_=(x: Indexable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "ArcElement.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
