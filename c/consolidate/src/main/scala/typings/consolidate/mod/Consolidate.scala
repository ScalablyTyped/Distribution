package typings.consolidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ engine in consolidate.consolidate.SupportedTemplateEngines ]: consolidate.consolidate.RendererInterface} */ trait Consolidate extends js.Object {
  /**
    * expose the instance of the engine
    */
  var requires: RequiresType
  /**
    * Clear the cache.
    *
    * @api public
    */
  def clearCache(): Unit
}

object Consolidate {
  @scala.inline
  def apply(clearCache: () => Unit, requires: RequiresType): Consolidate = {
    val __obj = js.Dynamic.literal(clearCache = js.Any.fromFunction0(clearCache), requires = requires.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Consolidate]
  }
}

