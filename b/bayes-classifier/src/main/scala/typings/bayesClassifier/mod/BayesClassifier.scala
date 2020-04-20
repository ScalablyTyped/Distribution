package typings.bayesClassifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BayesClassifier extends js.Object {
  def addDocument(doc: String, label: String): Unit
  def addDocuments(docs: js.Array[String], label: String): Unit
  def classify(doc: String): String
  def getClassifications(doc: String): Classifications
  def restore(classifier: js.Any): Unit
  def train(): Unit
}

object BayesClassifier {
  @scala.inline
  def apply(
    addDocument: (String, String) => Unit,
    addDocuments: (js.Array[String], String) => Unit,
    classify: String => String,
    getClassifications: String => Classifications,
    restore: js.Any => Unit,
    train: () => Unit
  ): BayesClassifier = {
    val __obj = js.Dynamic.literal(addDocument = js.Any.fromFunction2(addDocument), addDocuments = js.Any.fromFunction2(addDocuments), classify = js.Any.fromFunction1(classify), getClassifications = js.Any.fromFunction1(getClassifications), restore = js.Any.fromFunction1(restore), train = js.Any.fromFunction0(train))
    __obj.asInstanceOf[BayesClassifier]
  }
}

