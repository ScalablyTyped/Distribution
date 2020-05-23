package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObject extends js.Object {
  var filePath: String
  var outputPath: String
  var shouldWatch: Boolean
}

object FileObject {
  @scala.inline
  def apply(filePath: String, outputPath: String, shouldWatch: Boolean): FileObject = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], shouldWatch = shouldWatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileObject]
  }
}

