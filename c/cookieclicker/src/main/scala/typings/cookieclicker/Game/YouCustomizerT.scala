package typings.cookieclicker.Game

import typings.cookieclicker.anon.RecordYouCustomizerAddonG
import typings.cookieclicker.anon.RecordYouCustomizerColorG
import typings.cookieclicker.cookieclickerInts.`-1`
import typings.cookieclicker.cookieclickerInts.`0`
import typings.cookieclicker.cookieclickerInts.`1`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YouCustomizerT extends StObject {
  
  /**
    * currentGenes[i] is an index to genes[i].choices
    */
  var currentGenes: js.Array[Double] = js.native
  
  /**
    * Opens the prompt for exporting the current gene configuration.
    */
  def `export`(): Unit = js.native
  
  var genes: js.Array[YouCustomizerGene[Double | (js.Tuple2[Double, Double])]] = js.native
  
  /**
    * Maps the ID of the gene to the gene itself.
    * The last line is there to support modded genes.
    */
  var genesById: RecordYouCustomizerAddonG & RecordYouCustomizerColorG & (Record[String, YouCustomizerGene[Double | (js.Tuple2[Double, Double])]]) = js.native
  
  def getGeneValue(id: String): Double = js.native
  
  /**
    * Opens the prompt for importing the current gene configuration.
    * `def` is the default string for the prompt; unused.
    */
  def `import`(): Unit = js.native
  def `import`(`def`: String): Unit = js.native
  
  /**
    * Calls Game.YouCustomizer.resetGenes() if noReset is not true,
    * then loads Game.YouCustomizer by parsing the given string.
    */
  def load(genes: String): Boolean = js.native
  def load(genes: String, noReset: Boolean): Boolean = js.native
  
  /**
    * Adds the offset `off` to currentGenes[i], where i = genesById[gene].n.
    * Also may award the achievement 'In her likeness'.
    */
  def offsetGene(gene: String, off: `-1` | `0` | `1`): Unit = js.native
  
  /**
    * Opens the prompt for customizing the clones.
    */
  def prompt(): Unit = js.native
  
  /**
    * Changes the genes uniformly at random.
    * Does not award 'In her likeness'.
    */
  def randomize(): Unit = js.native
  
  def render(): Unit = js.native
  
  /**
    * Renders the clone preview in the "Customize your clones" prompt.
    */
  def renderPortrait(): Unit = js.native
  
  def resetGenes(): Unit = js.native
  
  /**
    * Returns a string representation of the YouCustomizer.
    */
  def save(): String = js.native
}
