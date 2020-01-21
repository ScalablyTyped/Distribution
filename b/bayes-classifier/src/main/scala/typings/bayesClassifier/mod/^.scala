package typings.bayesClassifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bayes-classifier", JSImport.Namespace)
@js.native
class ^ () extends BayesClassifier {
  /* CompleteClass */
  override def addDocument(doc: String, label: String): Unit = js.native
  /* CompleteClass */
  override def addDocuments(docs: js.Array[String], label: String): Unit = js.native
  /* CompleteClass */
  override def classify(doc: String): String = js.native
  /* CompleteClass */
  override def getClassifications(doc: String): Classifications = js.native
  /* CompleteClass */
  override def restore(classifier: js.Any): Unit = js.native
  /* CompleteClass */
  override def train(): Unit = js.native
}

