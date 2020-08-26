package typings.bayesClassifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BayesClassifier extends js.Object {
  def addDocument(doc: String, label: String): Unit = js.native
  def addDocuments(docs: js.Array[String], label: String): Unit = js.native
  def classify(doc: String): String = js.native
  def getClassifications(doc: String): Classifications = js.native
  def restore(classifier: js.Any): Unit = js.native
  def train(): Unit = js.native
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
  @scala.inline
  implicit class BayesClassifierOps[Self <: BayesClassifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddDocument(value: (String, String) => Unit): Self = this.set("addDocument", js.Any.fromFunction2(value))
    @scala.inline
    def setAddDocuments(value: (js.Array[String], String) => Unit): Self = this.set("addDocuments", js.Any.fromFunction2(value))
    @scala.inline
    def setClassify(value: String => String): Self = this.set("classify", js.Any.fromFunction1(value))
    @scala.inline
    def setGetClassifications(value: String => Classifications): Self = this.set("getClassifications", js.Any.fromFunction1(value))
    @scala.inline
    def setRestore(value: js.Any => Unit): Self = this.set("restore", js.Any.fromFunction1(value))
    @scala.inline
    def setTrain(value: () => Unit): Self = this.set("train", js.Any.fromFunction0(value))
  }
  
}

