package typings.combineSourceMap.mod

import typings.combineSourceMap.anon.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Combiner extends js.Object {
  
  def _addExistingMap(sourceFile: String, source: String, existingMap: js.Any): Combiner = js.native
  def _addExistingMap(sourceFile: String, source: String, existingMap: js.Any, offset: Offset): Combiner = js.native
  
  def _addGeneratedMap(sourceFile: String, source: String): Combiner = js.native
  def _addGeneratedMap(sourceFile: String, source: String, offset: Offset): Combiner = js.native
  
  /**
    * Adds map to underlying source map.
    * If source contains a source map comment that has the source of the original file inlined it will offset these
    * mappings and include them.
    * If no source map comment is found or it has no source inlined, mappings for the file will be generated and included
    * @param opts the 'sourceFile' path/name and the file's 'source' contents
    * @param offset the source file 'line' number and 'column' number offsets
    */
  def addFile(opts: Source): Combiner = js.native
  def addFile(opts: Source, offset: Offset): Combiner = js.native
  
  /**
    * output the combined source map in base64 format
    * @return base64 encoded combined source map
    */
  def base64(): String = js.native
  
  /**
    * generate a base64 encoded sourceMappingURL comment
    * @return base64 encoded sourceMappingUrl comment of the combined source map
    */
  def comment(): String = js.native
}
